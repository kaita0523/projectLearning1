
public class HonorPictureSelect {

	//仮の称号情報
	private static String[][] Honors = {{"神0", "2"},{"神1", "1"},{"神2", "0"},{"神3", "1"},{"神4", "0"},{"神5", "1"}};
	private static int honorNum = 6;
	
	//仮の称号取得メソッド（乱数で選択）
	public static String getHonorFromPlayer() {
		int i;
		i = (int) (Math.random()*honorNum);
		System.out.println(i);
		return "神" + i;
	}
	
	public static String getHonorBlackPicture(){	//黒石に使う画像のファイル名を取得
		String honorType;
		String hbp = null;
		honorType = getHonorFromPlayer();
		for(int i=0;i<honorNum;i++){
			if(honorType.equals(Honors[i][0])){
				hbp= "black" + Integer.toString(i) + ".png";	//.gifへ変更の可能性あり
			}
		}
		return hbp;
	}
	public static String getHonorWhitePicture(){	//白石に使う画像のファイル名を取得
		String honorType;
		String hwp = null;
		honorType = getHonorFromPlayer();
		for(int i=0;i<honorNum;i++){
			if(honorType.equals(Honors[i][0])){
				hwp= "white" + Integer.toString(i) + ".png";	//.gifへ変更の可能性あり
			}
		}
		return hwp;
	}
	public static String getHonorFramePicture(){	//盤面に使う画像のファイル名を取得
		String honorType;
		String hfp = null;
		honorType = getHonorFromPlayer();
		for(int i=0;i<honorNum;i++){
			if(honorType.equals(Honors[i][0])){
				hfp= "frame" + Integer.toString(i) + ".png";	//.gifへ変更の可能性あり
			}
		}
		return hfp;
	}

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//System.out.println(getHonorFromPlayer());
		System.out.println(getHonorBlackPicture());
		System.out.println(getHonorWhitePicture());
		System.out.println(getHonorFramePicture());
		
	}

}
