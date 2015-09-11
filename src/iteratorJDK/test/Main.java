package iteratorJDK.test;

import java.util.ArrayList;
import java.util.List;

import iterator.Channel;
import iterator.ChannelTypeEnum;
import iteratorJDK.ChannelIterator;
import iteratorJDK.ChannelIteratorUnSurN;

public class Main {

	public static void main(String[] args) {
		List<Channel> listeChannel = new ArrayList<>();
		listeChannel.add(new Channel("M6 Kids", ChannelTypeEnum.KIDS));
		listeChannel.add(new Channel("M6 Music", ChannelTypeEnum.MUSIC));
		listeChannel.add(new Channel("M6 Pipo", ChannelTypeEnum.NEWS));
		listeChannel.add(new Channel("M6", ChannelTypeEnum.GENERAL));
		
		ChannelIterator ci = new ChannelIterator(ChannelTypeEnum.MUSIC, listeChannel);
		
		while (ci.hasNext()) {
			Channel c = ci.next();
			System.out.println(c.toString());
		}
		
		System.out.println("****");
		
		ChannelIteratorUnSurN ciusn = new ChannelIteratorUnSurN(2, listeChannel);
		
		while (ciusn.hasNext()) {
			Channel c = ciusn.next();
			System.out.println(c.toString());
		}
	}

}
