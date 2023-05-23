package com.devsuperior.dslearn.services;


import com.devsuperior.dslearn.entities.User;
import com.devsuperior.dslearn.repositories.UserRepository;
import com.devsuperior.dslearn.services.exceptions.ForbiddenException;
import com.devsuperior.dslearn.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {


    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public User authorized() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return repository.findByEmail(username);
        } catch (Exception e) {
            throw new UnauthorizedException("Invalid user");
        }

    }
        public  void  validateSelfOfAdmin(Long userId){
            User user = authorized();
            if(!user.getId().equals(userId)){
                throw new ForbiddenException("Access denied");
            }
        }

}
