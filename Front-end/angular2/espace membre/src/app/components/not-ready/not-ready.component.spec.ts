/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { NotReadyComponent } from './not-ready.component';

describe('NotReadyComponent', () => {
  let component: NotReadyComponent;
  let fixture: ComponentFixture<NotReadyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NotReadyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NotReadyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
