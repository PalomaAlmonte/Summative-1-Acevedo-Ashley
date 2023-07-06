package com.company.summative1.controller;

import com.company.summative1.model.Answer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import java.util.Arrays;
import java.util.List;

// Magic 8 Ball controller
@RestController
public class MagicController {
    private List<String> possibleAnswers = Arrays.asList(
            "It is certain.",
            "It is decidedly so.",
            "Without a doubt.",
            "Yes, definitely.",
            "You may rely on it.",
            "As I see it, yes.",
            "Most likely.",
            "Outlook good.",
            "Yes.",
            "Signs point to yes.",
            "Reply hazy, try again.",
            "Ask again later.",
            "Better not tell you now.",
            "Cannot predict now.",
            "Concentrate and ask again.",
            "Don't count on it.",
            "My reply is no.",
            "My sources say no.",
            "Outlook not so good.",
            "Very doubtful."
    );

    @PostMapping("/magic")
    public <Question> Answer getMagicAnswer(@RequestBody Question question) {
        String randomAnswer = getRandomAnswer();
        Answer answer = new Answer();
        answer.setId(1L);
        answer.setQuestion(answer.getQuestion());
        answer.setAnswer(randomAnswer);
        return answer;
    }

    private String getRandomAnswer() {
        Random random = new Random();
        int index = random.nextInt(possibleAnswers.size());
        return possibleAnswers.get(index);
    }
}