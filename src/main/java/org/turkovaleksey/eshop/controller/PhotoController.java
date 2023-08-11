package org.turkovaleksey.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.repository.api.PhotoRepository;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.product.Photo;
import org.turkovaleksey.eshop.repository.model.product.Product;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/data/photos")
public class PhotoController {

    private PhotoRepository photoRepository;
    private ProductRepository productRepository;

    @Autowired
    public void setRepository(PhotoRepository photoRepository, ProductRepository productRepository) {
        this.photoRepository = photoRepository;
        this.productRepository = productRepository;
    }

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) throws IOException {

        return "redirect:/";
    }

    //, @RequestParam("id") Integer id
//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
//        Product product = productService.getById(17);
//        String fileUrl;
//
//        try {
//            Path uploadPath = Paths.get(uploadDir).toAbsolutePath();
//            if (!Files.exists(uploadPath)) {
//                Files.createDirectories(uploadPath);
//            }
//
//            // Сохраняем файл в папке загрузки
//            Path filePath = uploadPath.resolve(file.getOriginalFilename());
//            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
//
//            // Создание и сохранение объекта Photo
//            Photo photo = new Photo();
//            photo.setFilename(file.getOriginalFilename());
//            fileUrl = filePath.toString();
//            photo.setFilePath(fileUrl);
//            photo.setProduct(product);
//            photoService.saveOrUpdate(photo);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return ResponseEntity.ok(fileUrl);
//    }
}
