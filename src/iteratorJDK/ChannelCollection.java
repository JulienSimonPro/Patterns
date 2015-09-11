package iteratorJDK;

import iterator.Channel;
import iterator.ChannelTypeEnum;

public interface ChannelCollection {
	public void addChannel(Channel c);

	public void removeChannel(Channel c);

	public ChannelIterator iterator(ChannelTypeEnum type);
	public ChannelIteratorUnSurN iterator(int unSurN);
}
