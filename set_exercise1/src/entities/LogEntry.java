package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {

	private String username;
	private Instant instant;
	
	public LogEntry(String username, Instant instant) {
		this.username = username;
		this.instant = instant;
	}

	public String getName() {
		return username;
	}

	public void setName(String username) {
		this.username = username;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}
}
