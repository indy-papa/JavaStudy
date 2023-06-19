package com.example.model;

import lombok.Data;
/*import lombok.Getter;
import lombok.Setter;
*/

// Lombokの@Dataアノテーション。
// GetterやSetter、toStringなどのコードを自動生成してくれます。
// 自動生成されている事は、[アウトライン]ビューで確認できます（下記イメージ参照）。
@Data
public class User {
/*	@Getter
	@Setter*/
	private String name;
/*	@Getter
	@Setter*/
	private String email;
/*	@Getter
	@Setter*/
	private Integer age;
}
