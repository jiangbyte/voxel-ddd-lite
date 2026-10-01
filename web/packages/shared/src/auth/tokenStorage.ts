import type { AppScope } from '../types'

const TOKEN_KEYS: Record<AppScope, string> = {
  portal: 'voxel_portal_token',
  admin: 'voxel_admin_token',
}

export function createTokenStorage(scope: AppScope) {
  const key = TOKEN_KEYS[scope]

  return {
    get(): string | null {
      return localStorage.getItem(key)
    },
    set(token: string) {
      localStorage.setItem(key, token)
    },
    clear() {
      localStorage.removeItem(key)
    },
  }
}
