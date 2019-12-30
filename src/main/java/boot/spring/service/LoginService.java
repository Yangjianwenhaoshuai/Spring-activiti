package boot.spring.service;


import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	String getpwdbyname(String name);
}
