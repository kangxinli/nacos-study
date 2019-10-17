package com.sample.nacos.spring.cloud.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.sample.nacos.spring.cloud.dao.UserRepository;
import com.sample.nacos.spring.cloud.model.User;
import com.sample.nacos.spring.cloud.service.UserService;

/**
 * @author hexu.hxy
 * @date 2019/1/7
 */

@Service
@RefreshScope
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    @SuppressWarnings("rawtypes")
	private final RedisTemplate redisTemplate;

    @Value("${app.user.cache}")
    private boolean cache;

    @SuppressWarnings("rawtypes")
	@Autowired
    public UserServiceImpl(UserRepository userRepository, RedisTemplate redisTemplate) {
        this.userRepository = userRepository;
        this.redisTemplate = redisTemplate;
    }

    @SuppressWarnings({ "unchecked" })
    @Override
    public User findById(Long id) {
        LOGGER.info("cache: {}", cache);

        if (cache) {
            Object obj = redisTemplate.opsForValue().get(key(id));
            if (obj != null) {
                LOGGER.info("get user from cache, id: {}", id);
                return (User)obj;
            }
        }

        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            if (cache) {
                LOGGER.info("set cache for user, id: {}", id);
                redisTemplate.opsForValue().set(key(id), user);
            }
        }

        return user;
    }

    private String key(Long id) {
        return String.format("nacos-spring-cloud-config-multi-data-ids-example:user:%d", id);
    }

}