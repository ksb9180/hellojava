package com.javaex.problem02;

public class Base {
    public void service(String state) {
        //코드작성
    	if (("낮").equals(state)) {
    		day();
    	} else if(("밤").equals(state)) {
    		night();
    	} else {
    		afternoon();
    	}
    }

    public void day() {
        System.out.println("낮에는 열심히 일하자");
    }
    public void night() {
    	System.out.println("night");
    }
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }
}
