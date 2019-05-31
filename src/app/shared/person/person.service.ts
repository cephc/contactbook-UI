import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';

@Injectable({providedIn: 'root'})
export class PersonService {
  public_API = 'http://localhost:8080/person'

  constructor(private http: HttpClient) {
  }
  get(id: number): Observable<any>{
    return this.http.get(`http://localhost:8080/person/${id}`);
  }

  getAll(): Observable<any> {
    return this.http.get('http://localhost:8080/people');
  }

  save(person: Object): Observable<Object> {
     return this.http.post(this.public_API, person) 
  }
  remove(id: number) {
    return this.http.delete(`http://localhost:8080/person/${id}`);
  }
  update(id: number, value: any): Observable<Object> {
    return this.http.put(`http://localhost:8080/person/${id}`, value);
  }
}
