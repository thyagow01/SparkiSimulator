import pygame


# Lê o .txt e salva os comandos em uma array (comandos)

comandos = []

with open("teste.txt", "r", encoding="utf-8") as file:
    content = file.read()

linhas = content.strip().split('\n')

#parte do pygame

pygame.init()
screen = pygame.display.set_mode((1280, 720))
clock = pygame.time.Clock()
sparkiPos = pygame.Vector2(screen.get_width()/2,screen.get_height()/2)
running = True
dt = 0


t0 = 0
t = 1000


while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False



    screen.fill("blue")

    pygame.draw.circle(screen,"red",sparkiPos,40)



    dt = clock.tick(60) / 1000


    tempo_atual = pygame.time.get_ticks()
    
    if tempo_atual - t0 < t:
        sparkiPos.x += 300 * dt
    else:
        pass

    pygame.display.flip()


pygame.quit()


