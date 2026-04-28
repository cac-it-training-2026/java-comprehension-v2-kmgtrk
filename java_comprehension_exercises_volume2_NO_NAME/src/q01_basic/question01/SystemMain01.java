package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		Member data = new Member();

		data.name = "Miura Manabu";
		data.age = 24;
		data.rank = 1;

		data.showMember();

		data.name = "Sato Kensuke";
		data.age = 36;
		data.rank = 2;

		data.showMember();

	}

}
