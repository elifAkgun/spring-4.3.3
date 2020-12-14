
package code.elif.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Data {
	
	@NonNull
	private Integer id;
	
	@NonNull
	private String  name;
	
	private LocalDate date;

}
