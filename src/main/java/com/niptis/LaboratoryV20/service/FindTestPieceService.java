package com.niptis.LaboratoryV20.service;

import com.niptis.LaboratoryV20.entity.TestPiece;

import java.util.List;

public interface FindTestPieceService {
    List<TestPiece> find (TestPiece testPiece);
}
