import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PortfolioService, Profile } from './services/portfolio.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  profile?: Profile;
  loading = true;

  constructor(private readonly portfolioService: PortfolioService) {}

  ngOnInit(): void {
    this.portfolioService.getProfile().subscribe({
      next: (data) => {
        this.profile = data;
        this.loading = false;
      },
      error: () => {
        this.loading = false;
      }
    });
  }
}
