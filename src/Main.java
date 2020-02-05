import java.util.ArrayList;

public class Main {
	ArrayList<Block>blockChain=new ArrayList<Block>();
	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		String[] genesisBlock= {"This is the Genesis Block of the chain","It has to be hard coded"};
		Block genesis=new Block(0,genesisBlock);
		//System.out.println(genesis.getBlockHash());
		
		String[] block2Tran= {"Second block"};
		Block block2=new Block(genesis.getBlockHash(),block2Tran);
				
		System.out.println("Hash of genesis block:\t"+genesis.getBlockHash());
		System.out.println("Second block:\t"+block2.getBlockHash());
	}

}
