
package code.elif.model;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Data {
	
	@NonNull
	private Integer id;
	
	@NonNull
	private String  name;

}
