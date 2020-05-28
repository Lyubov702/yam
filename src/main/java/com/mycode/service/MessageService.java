package com.mycode.service;

import com.mycode.model.Message;
import com.mycode.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void save(Message message) {
        messageRepository.save(message);
    }

    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    public Message findById(long id) {
        Optional<Message> messageOptional = messageRepository.findById(id);
        return messageOptional.orElse(null);
    }

    public void deleteById( long id) {
        messageRepository.deleteById(id);
    }


}
