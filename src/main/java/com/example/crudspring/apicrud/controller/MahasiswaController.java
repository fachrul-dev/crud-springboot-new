package com.example.crudspring.apicrud.controller;

import com.example.crudspring.apicrud.entities.MahasiswaEntity;
import com.example.crudspring.apicrud.repositories.MahasiswaRepository;
import com.example.crudspring.apicrud.response.CommonResponse;
import com.example.crudspring.apicrud.response.CommonResponseGenerator;
import com.example.crudspring.apicrud.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mahasiswa")
public class MahasiswaController {

    @Autowired
    MahasiswaRepository mahasiswaRepository;
//    @Autowired
//    MahasiswaService mahasiswaService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;


    @GetMapping(value = "checkAPI")
    public CommonResponse<String> checkApi() {
        return commonResponseGenerator.successResponse("Halo","Success Check API");

    }

//    Post
    @PostMapping(value = "addMahasiswa")
    public CommonResponse<MahasiswaEntity> addMahasiswa(@RequestBody MahasiswaEntity param) {
        mahasiswaRepository.save(param);
        return commonResponseGenerator.successResponse(param,"Success add Mahasiswa");
    }

//    GET
    @GetMapping(value = "getAllMahasiswa")
    public CommonResponse<List<MahasiswaEntity>> getAllMahasiswa() {
        return commonResponseGenerator.successResponse(mahasiswaRepository.findAll(),"Success get all data");
    }
//    GET BY ID
    @GetMapping(value = "getById")
    public CommonResponse<MahasiswaEntity> getById(@RequestParam int id) {
        return commonResponseGenerator.successResponse(mahasiswaRepository.findById(id).get(),"Success get by id: " +id);
    }
//    Update
    @PostMapping(value = "updateMahasiswa")
    public  CommonResponse<MahasiswaEntity> updateMahasiswa(@RequestBody MahasiswaEntity param  ) {
        return commonResponseGenerator.successResponse(mahasiswaRepository.save(param),"Success update data id: "+param.getId());

    }

//    Delete
    @GetMapping(value = "deleteMahasiswa")
    public CommonResponse<List<MahasiswaEntity>> deleteMahasiswa(@RequestParam int id) {

        mahasiswaRepository.deleteById(id);
         List<MahasiswaEntity> mahasiswaList = mahasiswaRepository.findAll();
        return commonResponseGenerator.successResponse(mahasiswaList,"Success delete mahasiswa id: " +id);
    }
}
