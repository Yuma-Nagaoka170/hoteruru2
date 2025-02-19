package com.example.demo.form;

@Data
@AllArgsConstructor
public class HouseEditForm {
	@NotNull
	private Integer id;
	
	@NotBlank(message = "民宿名を入力してください。")
	private String name;
	
	private MultipartFile imageFile;
	
	@NotBlank(message="説明を入力してください。")
    private String description;
	
	@NotNull(message="宿泊料金を入力してください。")
	@Min(value = 1, message="宿泊料金は1円以上に設定してください。")
}
