package org.apache.service.impl;

import java.util.List;
import org.apache.entity.UserAddress;
import org.apache.inter.OrderService;
import org.apache.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private UserService userService;
	@Override
	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}
	
	

}
