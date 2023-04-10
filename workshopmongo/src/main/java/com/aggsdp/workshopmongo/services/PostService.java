package com.aggsdp.workshopmongo.services;

import com.aggsdp.workshopmongo.domain.Post;
import com.aggsdp.workshopmongo.domain.User;
import com.aggsdp.workshopmongo.dto.UserDTO;
import com.aggsdp.workshopmongo.repository.PostRepository;
import com.aggsdp.workshopmongo.repository.UserRepository;
import com.aggsdp.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;
    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(id));
    }


}
