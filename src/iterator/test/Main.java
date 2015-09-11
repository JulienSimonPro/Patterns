package iterator.test;

import iterator.*;

public class Main {

	public static void main(String[] args) {
		ChannelCollection listeChannel = new ChannelCollectionImpl();
		listeChannel.addChannel(new Channel("M6 Kids", ChannelTypeEnum.KIDS));
		listeChannel.addChannel(new Channel("M6 Music", ChannelTypeEnum.MUSIC));
		listeChannel.addChannel(new Channel("M6 Pipo", ChannelTypeEnum.NEWS));
		listeChannel.addChannel(new Channel("M6", ChannelTypeEnum.GENERAL));

		ChannelIterator it = listeChannel.iterator(ChannelTypeEnum.GENERAL);

		while (it.hasNext()) {
			Channel c = it.next();
			System.out.println(c.toString());
		}

		System.out.println("****");

		it = listeChannel.iterator(ChannelTypeEnum.KIDS);

		while (it.hasNext()) {
			Channel c = it.next();
			System.out.println(c.toString());
		}

	}

}
