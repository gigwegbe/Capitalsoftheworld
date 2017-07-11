package com.example.george.capitalsoftheworld;

/**
 * Created by George on 6/24/2017.
 */

public class Questions {
    public String mQuestion []= {
            "What is the capital of Russia?",
            "What is the capital of Wales?",
            "What is the capital of Malaysia?",
            "What is the capital of UAE?",
            "What is the capital of Tanzania?",
            "What is the capital of Lesotho?",
            "What is the capital of Canada?",
            "What is the capital of Peru?",
            "What is the capital of Australia?",
            "What is the capital of New Zealand?"

    };
    private String mChoices[][] = {
            {"Peterburg", "Moscow", "Ottawa", "Canberra"},
            {"Paris", "London", "Scotland", "Cardiff"},
            {"Kuala Lumpur", "Hong kong", "Fuji", "Canberra"},
            {"Peterburg", "Moscow", "Abu Dhabi", "Canberra"},
            {"Peterburg", "Abuja", "Dodoma", "Canberra"},
            {"Peterburg", "Moscow", "Ottawa", "Maseru"},
            {"Lima", "Moscow", "Ottawa", "Canberra"},
            {"Lima", "Moscow", "Ottawa", "Canberra"},
            {"Peterburg", "Moscow", "London", "Canberra"},
            {"Wellington", "Oslo", "Ottawa", "Canberra"}
    };

    private String mCorrectAnswer[] ={"Moscow","Cardiff","Kuala Lumpur","Abu Dhabi","Dodoma","Maseru","Ottawa","Lima","Canberra","Wellington"};


    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }
    public String getChoice1(int a){
    String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
    }

