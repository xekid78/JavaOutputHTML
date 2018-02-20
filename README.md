# JavaOutputHTML
HTML形式の出力

## 処理
HTML形式で関東の１都６県を表示するプログラムです。

## コード
```
public class sample8 {

  public static void main(String[] args) {
    String[] kanto = {"東京都","茨木県","栃木県","群馬県","埼玉県","千葉県","神奈川県"};
    System.out.println("<select name='area'>");
    for (int i = 0; i < 7; i++) {
      System.out.println("<option>" + kanto[i] + "</option>");
    }
      System.out.println("</select>");
    
    }

}
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
