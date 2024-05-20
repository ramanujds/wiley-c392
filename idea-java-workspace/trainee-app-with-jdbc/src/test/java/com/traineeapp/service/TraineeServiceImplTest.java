package com.traineeapp.service;

import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;
import com.traineeapp.repository.TraineeRepository;
import com.traineeapp.repository.TraineeRepositoryImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class TraineeServiceImplTest {

    @Mock
    private TraineeRepositoryImpl repository;

    @InjectMocks
    private TraineeServiceImpl traineeService;

//    @BeforeEach
//    void setUp() {
//        TraineeRepository repository = new TraineeRepositoryImpl();
//        traineeService = new TraineeServiceImpl(repository);
//    }


    @Test
    void testSaveTrainee() throws RecordNotFoundException {
        // Given
        Trainee trainee = new Trainee("Siddharth Gharage", "sid@abc.com", "Bangalore", LocalDate.parse("2000-10-08"));

        // When

        Mockito.when(repository.saveTrainee(trainee)).thenReturn(trainee);

        // Then
        Assertions.assertNotNull(traineeService.saveTrainee(trainee));

        // Verify

        Mockito.verify(repository,Mockito.times(1)).saveTrainee(trainee);

    }

//    @Test
//    void testFindTrainee() {
//
//    }

    @Test
    void testDeleteTrainee() throws RecordNotFoundException {
        // Given
        int id = 101;
        // When
        Mockito.doNothing().when(repository).deleteTrainee(id);

        // Then
        Assertions.assertDoesNotThrow(()->repository.deleteTrainee(id));

        // Verify
        Mockito.verify(repository,Mockito.times(1)).deleteTrainee(id);


    }


}
