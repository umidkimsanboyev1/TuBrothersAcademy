package uz.master.demotest.dto.file;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class FileUploadDto {
    private MultipartFile file;
}
