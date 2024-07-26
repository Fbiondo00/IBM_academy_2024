import { ComponentFixture, TestBed } from '@angular/core/testing';
import { IndexComponentProfile } from './index.component';


describe('IndexComponentProfile', () => {
  let component: IndexComponentProfile;
  let fixture: ComponentFixture<IndexComponentProfile>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IndexComponentProfile]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IndexComponentProfile);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
