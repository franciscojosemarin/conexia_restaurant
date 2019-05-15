package com.mf.mejorcocina.form;

import java.util.List;

public class Report1Form {
	private String month;
	private List<Report1DetalleForm> waiters;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public List<Report1DetalleForm> getWaiters() {
		return waiters;
	}

	public void setWaiters(List<Report1DetalleForm> waiters) {
		this.waiters = waiters;
	}

	@Override
	public String toString() {
		return "Report1Form [month=" + month + ", waiters=" + waiters + "]";
	}
}
