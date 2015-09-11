package iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channels;

	public ChannelCollectionImpl() {
		super();
		channels = new ArrayList<>();
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
		return new ChannelIteratorImpl(type, this.channels);
	}

	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			super();
			this.type = type;
			this.channels = channels;
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
}
