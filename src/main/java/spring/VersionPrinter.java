package spring;

public class VersionPrinter {
	private int majorVersion;
	public int getMajorVersion() {
		return majorVersion;
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public int getMinorVersion() {
		return minorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}

	private int minorVersion;
	
	public void print() {
		System.out.printf(" 이 프로그램이ㅡ 버전은 %d.%d 입니다.");
	}

}
