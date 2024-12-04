package com.employee.empc.repository;

import com.employee.empc.model.Holidays;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRepository extends MongoRepository<Holidays, String> {

}
