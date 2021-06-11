package com.example.drawinglayout.Interface;

import com.example.drawinglayout.DrawingView.BrushDrawingView;

public interface  BrushViewChangeListener {
    void onViewAdd(BrushDrawingView brushDrawingView);

    void onViewRemoved(BrushDrawingView brushDrawingView);

    void onStartDrawing();

    void onStopDrawing();
}
