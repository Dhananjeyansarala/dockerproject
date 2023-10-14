package docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/getdoc")
	public String get() {
		return "This is my Docker Project";
	}
}
