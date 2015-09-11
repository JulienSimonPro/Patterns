package iteratorJDK;

import java.util.Iterator;
import java.util.List;

import iterator.Channel;

public class ChannelIteratorUnSurN implements Iterator<Channel> {
	private List<Channel> channels;
	private int position;
	private int unSurN;

	public ChannelIteratorUnSurN(int unSurN, List<Channel> channels) {
		super();
		this.channels = channels;
		this.unSurN = unSurN;
	}

	@Override
	public boolean hasNext() {
		if (position < channels.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channels.get(position);
		position += unSurN;
		return c;
	}

}
