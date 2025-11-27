package com.example.examADFD.Service;

import com.example.examADFD.model.Place;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    public List<Place> getAllPlace() {
        return List.of(
                new Place(1L, "Da Nang", "https://picsum.photos/300/200?1", "Beautiful beach city"),
                new Place(2L, "Ha Noi", "https://picsum.photos/300/200?2", "Capital of Vietnam"),
                new Place(3L, "Ho Chi Minh City", "https://picsum.photos/300/200?3", "Biggest Vietnam city"),
                new Place(4L, "Da Lat", "https://picsum.photos/300/200?4", "Romantic mountain city")
        );
    }
}
