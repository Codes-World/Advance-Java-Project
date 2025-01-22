package io.amansoni.entityRelationships;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Column(name = "student_name", nullable = false)
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	@OneToOne(fetch = FetchType.LAZY)
	private StudentIdCard card;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public StudentIdCard getCard() {
		return card;
	}

	public void setCard(StudentIdCard card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", card=" + card.getCardNumber() + "]";
	}
	
	
}
