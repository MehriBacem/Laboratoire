/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { IsAdminService } from './is-admin.service';

describe('IsAdminService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [IsAdminService]
    });
  });

  it('should ...', inject([IsAdminService], (service: IsAdminService) => {
    expect(service).toBeTruthy();
  }));
});
