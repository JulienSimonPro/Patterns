package iteratorJDK;

import java.util.Iterator;
import java.util.List;

import iterator.Channel;
import iterator.ChannelTypeEnum;

public class ChannelIterator implements Iterator<Channel> {
	private List<Channel> channels;
	private int position;
	private ChannelTypeEnum type;

	public ChannelIterator(ChannelTypeEnum type, List<Channel> channels) {
		super();
		this.channels = channels;
		this.type = type;
	}

	@Override
	public boolean hasNext() {
		while (position < channels.size()) {
			Channel c = channels.get(position);
			if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.GENERAL)) {
				return true;
			} else {
				position++;
			}
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channels.get(position);
		position++;
		return c;
	}

}
