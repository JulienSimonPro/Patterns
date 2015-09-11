package iteratorJDK;

import java.util.ArrayList;
import java.util.List;

import iterator.Channel;
import iterator.ChannelTypeEnum;

public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channels;
	
	public ChannelCollectionImpl(List<Channel> channels) {
		super();
		this.channels = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		channels.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIterator(type, channels);
	}

	@Override
	public ChannelIteratorUnSurN iterator(int unSurN) {
		return new ChannelIteratorUnSurN(unSurN, channels);
	}

}
