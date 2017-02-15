package ru.javabegin.training.spring.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

	private String color;
	private int year;
	private boolean soundEnabled;

	private Hand hand;
	private Leg leg;
	private Head head;

	public ModelT1000() {
	}

	public ModelT1000(String color, int year, boolean soundEnabled) {
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(String color, int year, Hand hand, Leg leg, Head head) {
		this.color = color;
		this.year = year;
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(String color, int year, boolean soundEnabled, Hand hand, Leg leg, Head head) {
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public void initObject() {
		System.out.println("INIT");
	}

	public void destroyObject() {
		System.out.println("Destroy");
	}

	@Override
	public void fire() {
		head.calc();
		hand.catchSomething();
		leg.go();
		System.out.println(color);
		System.out.println(year);
		System.out.println(soundEnabled);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying bean T1000");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method after properties are set : " + color+ year+ soundEnabled);
	}
}
