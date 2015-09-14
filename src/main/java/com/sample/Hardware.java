package com.sample;

public class Hardware {

	// root node

	private String fixOrUpgrade;

	// FIX
	private String problemToFix;

	// shutdown/restart problems

	private boolean noisy;
	private boolean cleaned;
	private boolean demandingOperations;
	private boolean stucks;
	// private boolean

	// won't start problem

	private String startupSound;

	// audio/video problems

	private String typeOfSoundProblem;
	private boolean checkedVideoCable;

	// stuttering problems

	private boolean triedDifferentRam;

	// UPGRADE

	private String primaryUsage;

	// gaming

	private boolean slowLoading;
	private boolean fpsGames;
	private int ramSize;
	private int cpuCores;
	private int vramSize;

	// office jobs/internet surfing

	private boolean slowStartup;
	private boolean multitask;

	// multimedia

	private String htpcOrRegular;
	private int monitorSize;
	private boolean enoughStorage;
	private String speakers;
	private boolean dedicatedSoundCard;

	// Solution

	private String solution;

	public String getFixOrUpgrade() {
		return fixOrUpgrade;
	}

	public void setFixOrUpgrade(String fixOrUpgrade) {
		this.fixOrUpgrade = fixOrUpgrade;
	}

	public String getProblemToFix() {
		return problemToFix;
	}

	public void setProblemToFix(String problemToFix) {
		this.problemToFix = problemToFix;
	}

	public boolean isNoisy() {
		return noisy;
	}

	public void setNoisy(boolean noisy) {
		this.noisy = noisy;
	}

	public boolean isCleaned() {
		return cleaned;
	}

	public void setCleaned(boolean cleaned) {
		this.cleaned = cleaned;
	}

	public boolean isDemandingOperations() {
		return demandingOperations;
	}

	public void setDemandingOperations(boolean demandingOperations) {
		this.demandingOperations = demandingOperations;
	}

	public boolean isStucks() {
		return stucks;
	}

	public void setStucks(boolean stucks) {
		this.stucks = stucks;
	}

	public String getStartupSound() {
		return startupSound;
	}

	public void setStartupSound(String startupSound) {
		this.startupSound = startupSound;
	}

	public String getPrimaryUsage() {
		return primaryUsage;
	}

	public void setPrimaryUsage(String primaryUsage) {
		this.primaryUsage = primaryUsage;
	}

	public boolean isSlowLoading() {
		return slowLoading;
	}

	public void setSlowLoading(boolean slowLoading) {
		this.slowLoading = slowLoading;
	}

	public boolean isFpsGames() {
		return fpsGames;
	}

	public void setFpsGames(boolean fpsGames) {
		this.fpsGames = fpsGames;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getCpuCores() {
		return cpuCores;
	}

	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}

	public int getVramSize() {
		return vramSize;
	}

	public void setVramSize(int vramSize) {
		this.vramSize = vramSize;
	}

	public boolean isSlowStartup() {
		return slowStartup;
	}

	public void setSlowStartup(boolean slowStartup) {
		this.slowStartup = slowStartup;
	}

	public boolean isMultitask() {
		return multitask;
	}

	public void setMultitask(boolean multitask) {
		this.multitask = multitask;
	}

	public String getHtpcOrRegular() {
		return htpcOrRegular;
	}

	public void setHtpcOrRegular(String htpcOrRegular) {
		this.htpcOrRegular = htpcOrRegular;
	}

	public int getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(int monitorSize) {
		this.monitorSize = monitorSize;
	}

	public boolean isEnoughStorage() {
		return enoughStorage;
	}

	public void setEnoughStorage(boolean enoughStorage) {
		this.enoughStorage = enoughStorage;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public boolean isDedicatedSoundCard() {
		return dedicatedSoundCard;
	}

	public void setDedicatedSoundCard(boolean dedicatedSoundCard) {
		this.dedicatedSoundCard = dedicatedSoundCard;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getTypeOfSoundProblem() {
		return typeOfSoundProblem;
	}

	public void setTypeOfSoundProblem(String typeOfSoundProblem) {
		this.typeOfSoundProblem = typeOfSoundProblem;
	}

	public boolean isCheckedVideoCable() {
		return checkedVideoCable;
	}

	public void setCheckedVideoCable(boolean checkedVideoCable) {
		this.checkedVideoCable = checkedVideoCable;
	}

	public boolean isTriedDifferentRam() {
		return triedDifferentRam;
	}

	public void setTriedDifferentRam(boolean triedDifferentRam) {
		this.triedDifferentRam = triedDifferentRam;
	}

}
