package project.hmrs.business.services.storage;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import project.hmrs.entities.concretes.cvInformations.enums.StorageType;

public interface FileService {
	String uploadFile(MultipartFile file) throws IOException;
	StorageType getFileStorageName();
}
