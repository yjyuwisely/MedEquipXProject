package pink.supply.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pink.supply.mapper.LoginMapper;
import pink.supply.model.MemberVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapper logMap;
	

	@Override
	public MemberVO logisticsIn(MemberVO member) {
		return logMap.logisticsIn(member);
	}

}
