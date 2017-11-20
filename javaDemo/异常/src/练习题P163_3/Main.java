package 练习题P163_3;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			play(11);
		}catch(NoThisSongException e){
			System.out.println(e.getMessage());
		}
	}

	public static int play(int index) throws NoThisSongException{
		if (index > 10){
			throw new NoThisSongException("你播放的歌曲不存在");
		}
		System.out.println("正在播放");
		return index;
	}
}
