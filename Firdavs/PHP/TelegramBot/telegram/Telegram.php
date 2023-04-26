<?php


class Telegram
{
    private string $url = 'https://api.telegram.org';
    private string $token = '';

    public function __construct(string $token, $args = [])
    {
        $this->setToken($token);
    }


    public function setToken(string $token): void
    {
        if (strlen($token) > 0) {
            $this->token = $token;
            return;
        }
        throw new TelegramException('Token is required');
    }

    public function sendMessage()
    {

    }


}