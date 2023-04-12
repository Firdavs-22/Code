type AnswerOne = 64 extends number ? true : false;

type AnswerTwo = number extends 64 ? true : false;

type AnswerThree = string[] extends any ? true : false;

type AnswerFour = string[] extends any[] ? true : false;

type AnswerFive = never extends any ? true : false;

type AnswerSix = any extends any ? true : false;

type AnswerSeven = Date extends { new(...args: any[]): any } ? true : false;

type AnswerEight = typeof Date extends { new(...args: any[]): any } ? true : false;


export {};