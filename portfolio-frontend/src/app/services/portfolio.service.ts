import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Project {
  title: string;
  description: string;
  tech: string;
  repository: string;
  liveDemo: string;
}

export interface Profile {
  name: string;
  role: string;
  about: string;
  skills: string[];
  projects: Project[];
  email: string;
  linkedin: string;
}

@Injectable({ providedIn: 'root' })
export class PortfolioService {
  private readonly apiUrl = 'http://localhost:8080/api/profile';

  constructor(private readonly http: HttpClient) {}

  getProfile(): Observable<Profile> {
    return this.http.get<Profile>(this.apiUrl);
  }
}
