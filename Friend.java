package com.javaex.problem06;
public class Friend {
    private String name;
    private String hp;
    private String email;
    //필요한 메소드 작성

	public Friend() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Friend(String name, String hp, String email) {
		super();
		this.name = name;
		this.hp = hp;
		this.email = email;
	}

	public void showInfo(){
        System.out.println(name + " " + hp + " " + email);
    }

}
