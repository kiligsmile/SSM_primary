package cn.angel.service.impl;

import cn.angel.domain.User;
import cn.angel.dao.UserDao;
import cn.angel.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author smile
 * @since 2023-04-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
